(ns libpython-clj-example.core
  (:gen-class)
  (:require [libpython-clj.require :refer [require-python]]
            [libpython-clj.python :refer [py. py.. py.-] :as py]
            [taoensso.timbre :as log]))

(log/debug "Initializing python")
(py/initialize! :python-executable "/home/mp/.pyenv/versions/3.8.6"
                :library-path "/home/mp/.pyenv/versions/example/lib/python3.8/site-packages")


(require-python 'stanza)
(require-python 'stanza.models.common.doc)
(require-python '[spacy])
(require-python '[spacy_stanza :refer [StanzaLanguage]])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [nlp (-> (stanza/Pipeline :lang "pl" :processors "tokenize,mwt,pos,lemma,depparse")
                (StanzaLanguage))]
  (-> (nlp "Witaj świecie!")
      (second)
      (py.- "lemma_"))))
