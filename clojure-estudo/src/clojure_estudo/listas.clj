(ns clojure-estudo.listas)

(defn list1 []
  (println (list 1 2 3 4)))
(list1)


(defn list2 []
  "Cria uma nova lista adicionando os novos valores na lista anterior"
  (println (list* 1 2 3 4 [5,6])))
(list2)


(defn primeiro []
  (println (first (list 1 2 3))))
(primeiro)


(defn primeiroString []
  (println (first (list "Renan" "Muniz" "Merlo"))))
(primeiroString)


(defn retornaPosicaoEscolhidaLista []
  (println (nth (list 1 2,3) 0))
  (println (nth (list 1 2,3) 2)))
(retornaPosicaoEscolhidaLista)


(defn incluiInicioLista []
  (println (cons 0 (list 1 2,3))))
(incluiInicioLista)



(defn incluiInicioListaString []
  (println (cons "Renan" (list "Muniz" "Merlo"))))
(incluiInicioListaString)



(defn incluiNoFinalInvertido []
  (println (conj (list 1 2,3) "a" "b" "c")))
(incluiNoFinalInvertido)


(defn incluiNoFinalInvertido2 []
  (println (conj (list "a" "b" "c") "d" "e" "f")))
(incluiNoFinalInvertido2)



(defn restoDaListaAposPrimeiroElemento []
  (println (rest (list 1 2 3))))
(restoDaListaAposPrimeiroElemento)


(defn restoDaListaAposPrimeiroElemento2 []
  (println (rest (list "Renan" "Muniz" "Merlo"))))
(restoDaListaAposPrimeiroElemento2)