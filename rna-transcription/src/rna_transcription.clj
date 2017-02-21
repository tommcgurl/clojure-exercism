(ns rna-transcription)

(defn to-rna [dna-string]
  (def conversion-map {
      "G" "C"
      "C" "G"
      "T" "A"
      "A" "U"
    })
  (def dna-seq (clojure.string/split dna-string #""))
  (reduce
    (fn [acc next]
      (assert (get conversion-map next))
      (str acc (get conversion-map next)))
    "", dna-seq)
)
