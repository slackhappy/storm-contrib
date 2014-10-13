(defproject storm/storm-kafka "0.9.2-kafka-0.7-scala210-fs"
  :java-source-paths ["src/jvm"]
  :repositories {"scala-tools" "http://scala-tools.org/repo-releases"
                  "conjars" "http://conjars.org/repo/"}
  :dependencies [[org.scala-lang/scala-library "2.10.4"]
                  [kafka/core_2.10 "0.7.1-fs-a"
                  :exclusions [org.apache.zookeeper/zookeeper
                               log4j/log4j]]]
  :profiles
  {:provided {:dependencies [[org.apache.storm/storm-core "0.9.2-incubating"]
                             [org.slf4j/log4j-over-slf4j "1.6.6"]
                             ;;[ch.qos.logback/logback-classic "1.0.6"]
                             [org.clojure/clojure "1.4.0"]]}}
  :jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"]
  :min-lein-version "2.0")
