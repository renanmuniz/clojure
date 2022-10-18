(ns banco.imposto.logic-test
  (:require [clojure.test :refer :all]
           ;[banco.imposto.logic :refer :all]               ;importa todas as funcoes deste ns
           ;[banco.imposto.logic :refer [imposto-retido-fonte]] ;importa as funcoes especificadas
            [banco.imposto.logic :as l]                 ;importa dando um apelido ao ns
            ))


(deftest imposto-retido-fonte-test
  (testing "Dado um valor abaixo de 1000 reais nao deve ter imposto retido"
    (is (= (l/imposto-retido-fonte 1.00) 0.00))
    (is (= (l/imposto-retido-fonte 999.99) 0.00)))
  (testing "Dado um valor igual ou acima de 1000 reais imposto retido deve ser de 10 porcento"
    (is (= (l/imposto-retido-fonte 1000.00) 100.00))
    (is (= (l/imposto-retido-fonte 2000.00) 200.00))))
