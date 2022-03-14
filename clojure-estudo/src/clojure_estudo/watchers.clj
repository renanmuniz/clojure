(ns clojure-estudo.watchers)

;Watchers are functions added to variable types such as atoms and reference variables which get invoked when a value of
; the variable type changes. For example, if the calling program changes the value of an atom variable, and if a watcher
; function is attached to the atom variable, the function will be invoked as soon as the value of the atom is changed.


(defn AddWatcher []
  "Cria o watcher"
  (def x (atom 0))
  (add-watch x :watcher
             (fn [key atom old-state new-state]
               (println "The value of the atom has been changed")
               (println "old-state" old-state)
               (println "new-state" new-state))))


(defn executaWatcher []
  "Executa o watcher ao trocar valor de x"
  ((swap! x inc)))


(defn RemoveWatcher []
  (remove-watch x :watcher))

(AddWatcher)
(executaWatcher)
(RemoveWatcher)
(executaWatcher)



(defn Example1 []
  (def x (atom 0))
  (add-watch x :watcher
             (fn [key atom old-state new-state]
               (println "The value of the atom has been changed")
               (println "old-state" old-state)
               (println "new-state" new-state)))
  (reset! x 2))
(Example1)

(defn Example2 []
  (def x (atom 0))
  (add-watch x :watcher
             (fn [key atom old-state new-state]
               (println "The value of the atom has been changed")
               (println "old-state" old-state)
               (println "new-state" new-state)))
  (reset! x 2)
  (remove-watch x :watcher)
  (reset! x 4))
(Example2)
