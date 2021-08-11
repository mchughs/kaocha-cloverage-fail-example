(ns runner
  (:require [kaocha.repl]))

(defn -main [& _args]
  (kaocha.repl/run 'core-test {:plugins [:kaocha.plugin/cloverage]}))
