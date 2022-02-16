(ns clojure-estudo.operadores-logicos)

; e (and)
(and (> 10 8) (< 5 10))                                     ;true
(and (> 10 8) (< 5 4))                                     ;false


; ou (or)
(or (> 10 8) (< 5 10))                                     ;true
(or (> 10 8) (< 5 4))                                     ;true
(or (> 7 8) (< 5 4))                                     ;false

; nao(inversor) (not)
(not (> 4 5))                                               ;true
(not (> 10 5))                                               ;false