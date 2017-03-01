(ns word-count)

(defn word-count [phrase] ;; <- arglist goes here
  (def words (clojure.string/split phrase #"\W"))
  (reduce
    (fn [acc next-word]
      ;; Normalize the word (lower-case will do)
      (def normalized-word (clojure.string/lower-case next-word))
      (if
        (= "" normalized-word) acc ;; If empty just return the map
        (assoc acc ;; otherwise we should add to an existing map or create new one
                normalized-word
                (+ 1 (get acc normalized-word 0)))))
    {}
    words))
