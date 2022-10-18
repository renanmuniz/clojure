(ns clojure-segundatech.core-test
  (:require [clojure.test :refer :all]
            [clojure-segundatech.core :refer :all]))

(deftest taxa-de-entrega-test
  (testing "Dado um valor abaixo de 100 reais, a taxa de entrega deve ser de 15 reais."
    (is (= (taxa-de-entrega 10) 15 ))
    (is (= (taxa-de-entrega 100) 15 )))
  (testing "Dado um valor entre 100.01 e 200 reais, a taxa de entrega deve ser de 5 reais."
    (is (= (taxa-de-entrega 150) 5))
    (is (= (taxa-de-entrega 200) 5)))
  (testing "Dado um valor acima de 200 reais, a taxa de entrega deve ser de 0 reais."
    (is (= (taxa-de-entrega 200.01) 0))
    (is (= (taxa-de-entrega 299) 0)))
)
