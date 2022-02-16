(ns clojure-estudo.operadores-relacionais)

; igualdade

(= 2 2)                                                     ;=> true
(= 5 2)                                                     ;=> false

; diferenca
(not= 3 5)                                                  ;=> true
(not= 3 3)                                                  ;=> false

; menor
(< 3 5)                                                     ;=> true
(< 5 3)                                                     ;=> false

; menor ou igual
(<= 3 5)                                                    ;=> true
(<= 5 5)                                                    ;=> true
(<= 6 5)                                                    ;=> false

; maior
(> 10 8 )                                                   ;=> true
(> 8 10 )                                                   ;=> false

; maior ou igual
(>= 10 8 )                                                   ;=> true
(>= 10 10 )                                                   ;=> true
(>= 10 11 )                                                   ;=> false

