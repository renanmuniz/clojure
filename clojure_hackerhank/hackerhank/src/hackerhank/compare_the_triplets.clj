(ns hackerhank.compare-the-triplets)


(defn compareTriplets
  [a b]
  (let [alice 0
        bob 0]
    (if(> (nth a 0) (nth b 0)) (inc alice) (inc bob))
    (println "Alice = " alice "Bob = " bob)
  ))

(compareTriplets [1 2 3] [3 2 1])