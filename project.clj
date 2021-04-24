(defproject libpython-clj-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojurenlp/core "3.7.0"]
                 [org.clojure/core.async "0.4.474"]
                 [org.clojure/core.memoize "1.0.236"]
                 [com.stuartsierra/component "0.4.0"]
                 [org.danielsz/system "0.4.5"]
                 [clj-http "3.10.0"]
                 [cheshire "5.9.0"]                         ;; for :as :json in clj-http
                 [environ "1.2.0"]
                 [compojure "1.6.1"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [ring-middleware-format "0.7.3"]
                 [ring/ring-defaults "0.3.2"]
                 [ring-cors "0.1.12"]
                 [me.raynes/fs "1.4.6"]
                 [ring/ring-mock "0.4.0"]                   ;; testing
                 [liberator "0.15.2"]
                 [cheshire "5.9.0"]
                 [clj-python/libpython-clj "1.45"]
                 [binaryage/devtools "1.0.0"]
                 [com.taoensso/timbre "4.10.0"]
                 [clj-commons/conch "0.9.2"]
                 [nrepl "0.8.0"]
                 [fsmviz "0.1.3"]
                 [clj-grpc "0.1.2"]
                 ;   implementation 'io.grpc:grpc-netty-shaded:'
                 ;   implementation 'io.grpc:grpc-protobuf:1.32.1'
                 ;   implementation 'io.grpc:grpc-stub:1.32.1'
                 ;   compileOnly 'org.apache.tomcat:annotations-api:6.0.53
                 [com.google.protobuf/protobuf-java "3.10.0"]
                 [javax.annotation/javax.annotation-api "1.2"]
                 ;; grpc java dependencies: https://blog.jmibanez.com/2018/07/22/grpc-with-clojure-and-leiningen.html
                 [io.netty/netty-codec-http2 "4.1.25.Final"]
                 [io.grpc/grpc-core "1.25.0" :exclusions [io.grpc/grpc-api]]
                 [io.grpc/grpc-stub "1.25.0"]
                 [io.grpc/grpc-protobuf "1.25.0"]
                 [io.grpc/grpc-netty "1.25.0" :exclusions [io.netty/netty-codec-http2 io.grpc/grpc-core io.grpc/grpc-api]]
                 ]
  :main ^:skip-aot libpython-clj-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jar-name     "example.jar"
                       :uberjar-name "example-standalone.jar"
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
