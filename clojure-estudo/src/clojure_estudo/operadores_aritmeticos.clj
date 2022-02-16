(ns clojure-estudo.operadores-aritmeticos)

; adicao
(+ 1 2)                                                     ;=> 3

; subtracao
(- 10 2)                                                    ;=> 8

; multiplicacao
(* 2 3)                                                     ;=> 6
(* 2 1.5)                                                   ;=> 3.0

; divisao
(/ 10 2)                                                    ;=> 5
(/ 5 2)                                                     ;=> 5/2
(/ 5 2.5)                                                   ;=> 2.0

; incrementar
(inc 3)                                                     ;=> 4

; decrementar
(dec 5)                                                     ;=> 4

; retorna valor maximo entre os informados
(max 1 9 7 6 2)                                             ;=> 9

; retorna valor minimo entre os informados
(min 1 9 7 6 2)                                             ;=> 1

; 'modulo' resto da divisao
(rem 5 2)                                                   ;=> 1


; Exemplos de operações encadeadas:
(* 2 (+ 3 2))                                               ;=> 10

(inc (+ 2 2))                                               ;=> 5

(+ (+ 2 3) (/ 10 2))                                        ;=> 10

(dec(+ (+ 2 3) (/ 10 2)))                                   ;=> 9

