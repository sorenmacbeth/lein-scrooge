(ns leiningen.scrooge
  (:import
   [com.twitter.scrooge Main]))

(defn compile-thrift-sources [compiler-args]
  (let [c (com.twitter.scrooge.Compiler.)]
    (Main/parseOptions c (scala.collection.JavaConversions/asScalaBuffer compiler-args))
    (.run c)))

(defn scrooge
  "Run Twitter Scrooge compiler on Thrift IDL files"
  [project & args]
  (let [include-path  (or (get-in project [:scrooge :thrift-include-path]) "src/thrift")
        language      (or (get-in project [:scrooge :language]) "Java")
        dest-src-path (or (get-in project [:scrooge :thrift-destination-path])
                          (:java-source-path project)
                          (format "src/%s" (clojure.string/lower-case language)))
        compiler-args ["-l" language
                       "-d" dest-src-path]
        compiler-args (if (true? (get-in project [:scrooge :finagle]))
                        (conj compiler-args "--finagle")
                        compiler-args)
        compiler-args (if include-path
                        (concat compiler-args ["-i" include-path])
                        compiler-args)
        compiler-args (if-not (empty? args)
                        (concat compiler-args args)
                        (concat compiler-args (map #(.getName %) (.listFiles (java.io.File. (or include-path "src/thrift"))))))]
    (compile-thrift-sources compiler-args)))
