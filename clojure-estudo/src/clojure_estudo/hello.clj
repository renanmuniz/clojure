(ns clojure-estudo.hello)

(defn imprime [x]
  (println "Hello, " x "!"))

(defn imprime0 [x]
  (println "ola " x))

(defn imprime1 [x]
  x)

(defn imprime2 [x]
  x)

(imprime0 (imprime1 (imprime2 "Renan")))

