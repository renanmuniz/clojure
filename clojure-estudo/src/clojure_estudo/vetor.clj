(ns clojure-estudo.vetor
  (:require [clojure.set :as set])
(:gen-class))

(defn vetor []
  (println (vector 1 2 3)))
(vetor)

(defn vetor2 []
  (println (vector "Renan" "Muniz" "Merlo")))
(vetor2)

(defn vetorDeTipoDefinido []
  (println (vector-of :int 1 2 3)))
(vetorDeTipoDefinido)

(defn vetorDeTipoDefinidoErro []
  (println (vector-of :int 1 "a" 3)))
(vetorDeTipoDefinidoErro)

(defn vetorDeTipoDefinidoDouble []
  (println (vector-of :double 1.5 2 5)))
(vetorDeTipoDefinidoDouble)


(defn retornaElementoDoIndice []
  "Retorna elemento do vetor com base no indice"
  (println (nth (vector 1 2 3) 0))
  (println (nth (vector 1 2 3) 2)))
(retornaElementoDoIndice)

(defn retornaElementoDoIndiceParametro [x]
  "Retorna elemento do vetor com base no indice"
  (nth (vector 1 2 3 4 5 6 7 8 9) x))
(retornaElementoDoIndiceParametro 8)


(defn retornaElementoDoVetor [x]
  "Retorna elemento do vetor com base no numero de elementos e nao no indice"
  get (vector 1 2 3) x)
(retornaElementoDoVetor 3)


(defn adicionaElementoRetornaVetor [x]
  "Adiciona um elemento ao vetor e retorna atualizado"
  (println (conj (vector 1 2 3) x)))
(adicionaElementoRetornaVetor 8)


(defn adicionaElementoRetornaVetor2 []
  "Adiciona um elemento ao vetor e retorna atualizado"
  (println (conj (vector 1 2 3) "Renan")))
(adicionaElementoRetornaVetor2)


(defn retiraUmElementoDoVetor []
  "Retira um elemento do vetor, por ser uma estrutura de pilha, retira o ultimo item LIFO"
  "Em caso de fila ou lista, retira o primeiro FIFO"
  (println (pop (vector 1 2 3))))
(retiraUmElementoDoVetor)



(defn subVetor [x y]
  "Retorna um novo vetor de acordo com os indices de inicio e fim definidos"
  (println (subvec (vector 1 2 3 4 5 6 7 9 11 13 15) x y)))
(subVetor 1 8)

(defn subVetor2 [x y]
  "Retorna um novo vetor de acordo com os indices de inicio e fim definidos"
  (println (subvec (vector "a" "b" "c" "d" "e" "f") x y)))
(subVetor2 1 3)







