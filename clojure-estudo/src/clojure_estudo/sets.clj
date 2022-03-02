(ns clojure-estudo.sets
  (:require [clojure.set :as set])
  (:gen-class))

(defn set1 []
  (println (set '(1 1 2 2))))
(set1)

(defn set2 []
  (println (set '("a" "b" "c" "d" "b" "c"))))
(set2)

(defn setOrdenado []
  (println (sorted-set 3 2 1)))
(setOrdenado)

(defn setOrdenado2 []
  (println (sorted-set 3 2 1 4 1.5 2.5 9 7.1 3 4)))
(setOrdenado2)

(defn contem []
  (println (contains? (set '(3 2 1)) 2))
  (println (contains? (set '(3 2 1)) 5)))
(contem)

(defn adicionaERetorna []
  (def x (conj (set '(3 2 1)) 4 5 6 7))
  (println x))
(adicionaERetorna)


(defn retiraElementoERetorna []
  (println (disj (set '(3 2 1)) 2)))
(retiraElementoERetorna)


(defn retiraElementoERetorna2 []
  (println (disj (set '(3 2 1)) 4)))
(retiraElementoERetorna2)


(defn juntaDoisSets []
  (println (set/union #{1 2 3} #{3 4})))
(juntaDoisSets)


(defn diferencaEntreDoisSets []
  (println (set/difference #{1 2} #{2 3})))
(diferencaEntreDoisSets)


(defn intersecao []
  (println (set/intersection #{1 2} #{2 3})))
(intersecao)


(defn subSet []
  "Retorna se o primeiro set é um subconjunto do segundo"
  (println (set/subset? #{1 2} #{2 3}))                     ;false
  (println (set/subset? #{1 2} #{1 2 3})))                  ;true
(subSet)


(defn superSet []
  "Retorna se o segundo set é um subconjunto do primeiro"
  (println (set/superset? #{1 2} #{1 2 3}))                 ;false
  (println (set/superset? #{1 2 3} #{1 2})))                ;true
(superSet)