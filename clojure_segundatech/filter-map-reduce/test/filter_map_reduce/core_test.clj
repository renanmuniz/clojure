(ns filter-map-reduce.core-test
  (:require [clojure.test :refer :all]
            [filter-map-reduce.core :refer :all]))

(deftest is-quinto-ano?-test
  (testing "Dado um numero referente ao ano do estudante, deve retornar true se o numero informado for 5"
    (is (= (is-quinto-ano? 5) true)))
  (testing "Dado um numero referente ao ano do estudante, deve retornar false se o numero informado nao for 5"
  (is (= (is-quinto-ano? 4) false))))

(deftest soma-idades-test
  (testing "Dado as idades 5, 10 e 15, a soma deve ser 20"
    (is (= (soma-idades [5 10 5]) 20))))

(deftest tamanho-medio-nome-test
  (testing "Dados os nomes: renan vinicius evelyn ana, deve retornar a media de caracteres de tamanho dos nomes, nesse caso 11/2"
    (is (= (tamanho-medio-nomes ["renan" "vinicius" "evelyn" "ana c"]) 6))))


