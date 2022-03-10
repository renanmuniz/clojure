(ns clojure-estudo.destructuring)

; Destructuring is a functionality within Clojure, which allows one to extract values from a data structure,
; such as a vector and bind them to symbols without having to explicitly traverse the datastructure.

(defn Example1 []
  "=> 1 2 3 4"
  (def my-vector [1 2 3 4])
  (let [[a b c d] my-vector]
    (println a)
    (println b)
    (println c)
    (println d)
    (println a b c d)))
(Example1)

(defn Example2 []
  "=> 1 2 3"
  (def my-vector [1 2 3 4])
  (let [[a b c] my-vector]
    (println a)
    (println b)
    (println c)
    (println a b c)))
(Example2)

(defn Example3 []
  "=> 1 2 3 4 nil nil nil"
  (def my-vector [1 2 3 4])
  (let [[a b c d e f g] my-vector]
    (println a)
    (println b)
    (println c)
    (println d)
    (println e)
    (println f)
    (println g)
    (println a b c d e f g)))
(Example3)


(defn Example4 []
  "O resto do vetor vai para o novo vetor 'the-rest'"
  "=> 1 2 (3 4)"
  (def my-vector [1 2 3 4])
  (let [[a b & the-rest] my-vector]
    (println a b the-rest)))
(Example4)

; Destructuring maps:

(defn ExampleMap1 []
  "=> 1 2"
  (def my-map {"a" 1 "b" 2})
  (let [{a "a" b "b"} my-map]
    (println a b)))
(ExampleMap1)


(defn ExampleMap2 []
  "=> valor1"
  (def my-map {"chave1" "valor1" "chave2" "valor2"})
  (let [{a "chave1"} my-map]
    (println a)))
(ExampleMap2)


(defn ExampleMap3 []
  "=> valor1 valor2 nil"
  (def my-map {"chave1" "valor1" "chave2" "valor2" "chave3" "valor3"})
  (let [{a "chave1" b "chave2" c "chave4"} my-map]
    (println a b c)))
(ExampleMap3)