(ns clojure-estudo.maps
  (:require [clojure.set :as set])
  (:gen-class))

(defn hashmap1 []
  (def hashmap (hash-map "a" "1" "b" "2" "c" "3"))
  (println hashmap))
(hashmap1)

(defn hashmap2 []
  (def hashmap (hash-map "Renan" "31" "Vinicius" "26" "Ana" "10"))
  (println hashmap))
(hashmap2)

(defn sortedmap1 []
  "saida: {a 3, b 2, z 1}"
  (def sortedmap (sorted-map "z" "1" "b" "2" "a" "3"))
  (println sortedmap))
(sortedmap1)



(defn valorDeUmaKey []
  "'get' Retorna o valor de uma key"
  (def map (hash-map "a" "Renan" "b" "Muniz" "c" "Merlo"))
  (println map)
  (println (get map "b")))
(valorDeUmaKey)


(defn contemChave []
  (def map (hash-map "nome" "Renan" "sobrenome" "Muniz Merlo"))
  (println (contains? map "nome"))
  (println (contains? map "telefone")))
(contemChave)


(defn retornaChaveEValorCasoExista []
  (def map (hash-map "nome" "Renan" "sobrenome" "Muniz Merlo"))
  (println map)
  (println (find map "nome"))
  (println (find map "telefone")))
(retornaChaveEValorCasoExista)


(defn retornaChavesDoMap []
  (def map (hash-map "nome" "Renan" "sobrenome" "Muniz Merlo"))
  (println (keys map)))
(retornaChavesDoMap)


(defn retornaValoresDoMap []
  (def map (hash-map "nome" "Renan" "sobrenome" "Muniz Merlo"))
  (println (vals map)))
(retornaValoresDoMap)


(defn disassociaValorDeChaveDoMap []
  (def map (hash-map "nome" "Renan" "sobrenome" "Muniz Merlo" "telefone" "11999999999"))
  (println (vals map))
  (println (vals (dissoc map "telefone"))))
(disassociaValorDeChaveDoMap)


(defn mergeDoisMapsOperandoValoresDeChavesIguais []
  (def map1 (hash-map "a" 2 "b" 4))
  (def map2 (hash-map "b" 3 "c" 5))
  (println (merge-with * map1 map2)))
(mergeDoisMapsOperandoValoresDeChavesIguais)


(defn retornaSelecionados []
  (def map (hash-map "a" 2 "b" 4 "c" 6 "d" 8))
  (println (select-keys map ["a" "c"])))
(retornaSelecionados)


(defn renomearKey []
  (def map (hash-map "nome" "Renan" "sobrenome" "Muniz Merlo" "telefone" "11999999999"))
  (def mapnovo (set/rename-keys map {"nome" "name" "sobrenome" "lastname" "telefone" "phone"}))
  (println map)
  (println mapnovo))
(renomearKey)


(defn renomearKey []
  "Inverte o que era valor vira chave e vice-versa."
  (def map (hash-map "nome" "Renan" "sobrenome" "Muniz Merlo" "telefone" "11999999999"))
  (def mapinvertido (set/map-invert map))
  (println map)
  (println mapinvertido))
(renomearKey)






