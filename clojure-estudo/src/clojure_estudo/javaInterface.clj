(ns clojure-estudo.javaInterface)

(defn exemplo1 [nome]
  (println (.toUpperCase nome)))
(exemplo1 "renan")


(defn exemplo2 []
  (println (.indexOf "RENAN","A")))
(exemplo2)


(defn exemplo3 []
  (println (* 100 (Math/random))))
(exemplo3)