(ns casa-do-codigo.Fizzbuzz)

; Devemos criar uma função que nos retorne:
;- Fizz, se o número for divisível por 3;
;- buzz , se divisível por 5;
;- fizzbuzz , se divisível por 3 e por 5; ou
;- o próprio número, caso contrário.


(defn divisivelPor3 [x]
  (cond
  (= 0 (mod x 3)) true
  :else false))


(defn divisivelPor5 [x]
  (cond
    (= 0 (mod x 5)) true
    :else false))


(defn fizzbuzz [n]
  (cond
    (and (= true (divisivelPor3 n)) (= true (divisivelPor5 n))) (println "FizzBuzz")
    (= true (divisivelPor3 n)) (println "Fizz")
    (= true (divisivelPor5 n)) (println "Buzz")
    :else (println n)
  )
)

(defn fizzbuzzcomlista [lista]
  (doseq [l lista]                ;'for each' para cada valor da sequencia faca...
    (fizzbuzz l)
    ))