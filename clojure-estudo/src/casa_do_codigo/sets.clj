(ns casa-do-codigo.sets)

(def meuset (hash-set "Renan" "Antonio" "Jose"))
(println meuset)

(conj meuset "Maria")                                       ; imutabilidade, adiciona provisoriamente mas nao fica la.
                                                             ; => #{"Maria" "Antonio" "Renan" "Jose"}

(conj meuset "Renan")                                       ;=> #{"Antonio" "Renan" "Jose"} Nao adiciona um que ja tem

