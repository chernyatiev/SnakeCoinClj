(ns snake-coin-clj.core
  (:require [digest]))


(def blockchain (atom []))


(defn hash-block [index timestamp data previous-hash]
  (let [s (str index timestamp data previous-hash)]
    (digest/sha-256 s)))

(defn create-block
  "create hash-map with block data"
  [index timestamp data previous-hash]

  {:index index
   :timestamp timestamp
   :data data
   :previous-hash previous-hash
   :hash (hash-block index timestamp data previous-hash)})


(defn get-last-block []
  (last @blockchain))

(defn create-genesis-block [])


(defn add-block-to-blockchain [block]
  (swap! blockchain ))


(defn create-next-block [data]
  (let [previous-block (get-last-block)]))
