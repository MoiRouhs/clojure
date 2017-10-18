;; Introducir  texto dese la consola

(println "Introdusca texto => ") 
(def entrada (read-line)) ;; Carga el texto introducido con "read-line" a la variable entrada
(println "== ### ==")
(println (str "La entrada es " entrada)) ;; "str" encadena el texto con la variable entrada
