(defproject org.clojars.sorenmacbeth/lein-scrooge "0.1.3-SNAPSHOT"
  :description "Leiningen plugin to run Twitter Scrooge compiler on Thrift IDL files"
  :url "http://github.com/jcrean/lein-scrooge"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.twitter/finagle-core_2.10 "6.16.0"]
                 [com.twitter/finagle-thrift_2.10 "6.16.0"]
                 [com.twitter/scrooge-runtime_2.10 "3.15.0"]
                 [com.twitter/scrooge-generator_2.10 "3.15.0"]
                 [org.apache.thrift/libthrift "0.9.1"]]
  :eval-in-leiningen true)
