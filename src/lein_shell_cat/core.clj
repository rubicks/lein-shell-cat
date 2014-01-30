(ns lein-shell-cat.core
  (:gen-class))

(defn -main [& args]
  (let [split-events (line-seq (java.io.BufferedReader. (java.io.InputStreamReader. System/in)))]
    (doseq [event split-events] (println event))))
