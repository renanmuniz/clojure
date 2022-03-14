(ns clojure-estudo.metadata)

;n Clojure, metadata is used to annotate the data in a collection or for the data stored in a symbol.
; This is normally used to annotate data about types to the underlying compiler, but can also be used for developers.
; Metadata is not considered as part of the value of the object. At the same time, metadata is immutable.


(defn Metadata1 []
  (def my-map (with-meta [1 2 3] {:prop "values" :deprecated "true"}))
  (println (meta my-map)))
(Metadata1)

(defn Metadata2 []
  (def my-map (with-meta [1 2 3] {:prop "values"}))
  (println (meta my-map))
  (def new-map (vary-meta my-map assoc :newprop "new values"))
  (println (meta new-map)))
(Metadata2)