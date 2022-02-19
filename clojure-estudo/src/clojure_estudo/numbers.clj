(ns clojure-estudo.numbers)


(defn TipoDaVariavel []
  "Imprime o tipo que esta na variavel x e y"
  (def x 5)
  (def y 5.25)
  (def z "renan")
  (println (type x))
  (println (type y))
  (println (type z)))
(TipoDaVariavel)


; Testes com numeros:

(defn ehZero [x]
  "retorna true se valor informado for zero"
  (println (zero? x))
  )
(ehZero 0)

(defn ehPositivo [x]
  "retorna true se valor informado for positivo"
  (println (pos? x))
  )
(ehPositivo 1)

(defn ehNegativo [x]
  "retorna true se valor informado for negativo"
  (println (neg? x))
  )
(ehNegativo -1)

(defn ehPar [x]
  "retorna true se valor informado for par"
  (println (even? x))
  )
(ehPar 2)

(defn ehImpar [x]
  "retorna true se valor informado for impar"
  (println (odd? x))
  )
(ehImpar 3)

(defn ehNumero [x]
  "retorna true se valor informado for numero"
  (println (number? x))
  )
(ehNumero 1)

(defn ehNumero2 [x]
  "retorna true se valor informado for numero"
  (println (number? x))
  )
(ehNumero2 "abc")

(defn ehInteiro [x]
  "retorna true se valor informado for inteiro"
  (println (integer? x))
  )
(ehInteiro 1)

(defn ehInteiro2 [x]
  "retorna true se valor informado for inteiro"
  (println (integer? x))
  )
(ehInteiro2 1.5)

(defn ehFloat [x]
  "retorna true se valor informado for ponto flutuante"
  (println (float? x))
  )
(ehFloat 1)

(defn ehFloat2 [x]
  "retorna true se valor informado for ponto flutuante"
  (println (float? x))
  )
(ehFloat2 1.5)