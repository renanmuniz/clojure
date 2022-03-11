(ns clojure-estudo.dates)


(defn Example1 []
  "Retorna data atual no formato 'Fri Mar 11 09:48:08 BRT 2022'"
  (def date (.toString (java.util.Date.)))
  (println date))
(Example1)

; Formatar data

(defn formatarData1 []
  (def date (.format (java.text.SimpleDateFormat. "dd/MM/yyyy") (new java.util.Date)))
  (println date))
(formatarData1)


(defn formatarData2 []
  (def date (java.time.LocalDateTime/now))
  (def formatter (java.time.format.DateTimeFormatter/ofPattern "dd/MM/yyyy HH:mm:ss"))
  (.format date formatter)) ;;=> "2020-07-18 18:04:04"
(formatarData2)

(defn stringToDate []
  (def date
    (.format (java.text.SimpleDateFormat. "dd/MM/yyyy") (.parse (java.text.SimpleDateFormat. "MMddyyyy") "03112022")))
  (println date))
(stringToDate)


(defn stringToDate2 [datastr]
  "converter string de data no formato dd/MM/yyyy para formato MM-dd-yyyy HH:mm:ss"
  (def formatoDeEntrada "dd/MM/yyyy")
  (def formatoDeSaida "MM-dd-yyyy HH:mm:ss")
  (try
    (def data (.format
        (java.text.SimpleDateFormat. formatoDeSaida) (.parse (java.text.SimpleDateFormat. formatoDeEntrada) datastr)))
    (.toString data)
    (catch Exception ex (println (.getMessage ex)))
  )
)
(stringToDate2 "11/03/2022")