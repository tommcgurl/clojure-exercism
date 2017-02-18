(ns bob)

(defn response-for [statement] ;; <- arglist goes here
  (cond
    (and
      (= (clojure.string/upper-case statement) statement)
      (not= (clojure.string/lower-case statement) statement)) "Whoa, chill out!"
    (= (last statement) \?) "Sure."
    (= (clojure.string/trim statement) "") "Fine. Be that way!"
    :else "Whatever."))
