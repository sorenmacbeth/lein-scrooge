(defproject lein-scrooge "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dev-dependencies [[swank-clojure "1.4.2"]]
  :dependencies [[com.twitter/finagle-core "6.3.0"]
                 [com.twitter/finagle-thrift "6.3.0"]
                 [com.twitter/scrooge-runtime "3.1.1"]
                 [com.twitter/scrooge-generator "3.1.1"]
                 [org.apache.thrift/libthrift "0.8.0"]]
  :eval-in-leiningen true
  )
