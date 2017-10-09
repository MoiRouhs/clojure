(if (>= 3 5) ;; If al diferente que en otros lenguajes solo puede comprar una expresión
  (println "Es mayor") ;; Si es verdad ejecuta este código
  (println "No es mayor") ;; si es falso ejecuta este otro.
)

(if (= "amor" "amor") ;; Tambien se pueden comparar cadenas de texto.
	(println "Son iguales")
	(println "Son diferentes") ;; If no tiene else.
)

(defn pos-neg-or-zero [n]
  (cond ;; Cond sirve para comparar más de una espresión.
  	(not (number? n)) (println "Es letra") ;; Not toma como verdadero la siguiente sentencia si es falsa. (Not = false + false = true)
    (< n 0) (println "negative") 
    (> n 0) (println "positive")
    :else (println "zero") ;; Este si cuenta con un else por si no se cumple los casos.
  )
)

(pos-neg-or-zero "u") ;; Cambiar el valor para verificar.
