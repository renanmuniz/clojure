(ns clojure-estudo.recursividade)

(defn Recursividade []
  (loop [i 0]
    (when (< i 10)
      (println i)
      (recur (inc i))
    )
  )
)
(Recursividade)
