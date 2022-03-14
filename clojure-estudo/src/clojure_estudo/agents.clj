(ns clojure-estudo.agents)

;Agents provide independent, asynchronous change of individual locations.
; Agents are bound to a single storage location for their lifetime, and only allow mutation of that location
; (to a new state) to occur as a result of an action. Actions are functions (with, optionally, additional arguments)
; that are asynchronously applied to an Agent’s state and whose return value becomes the Agent’s new state.



;An agent is created by using the agent command.
(defn agent1 []
  (def counter (agent 8))
  (println counter))
(agent1)

(defn agent2 []
  (def counter (agent 0))
  (println @counter))
(agent2)


;This function is used to send across a value to the agent.
(defn send1 []
  (def counter (agent 0))
  (println @counter)

  (send counter + 100)
  (println "Incrementing Counter")
  (println @counter))
(send1)


;This function is used to shut down any running agents.
(defn shutdownAgents []
  (def counter (agent 0))
  (println @counter)

  (send counter + 100)
  (println "Incrementing Counter")
  (println @counter)
  (shutdown-agents))
(shutdownAgents)



;There are instances wherein an agent is assigned a function which is blocking in nature.
; A simple example is, consider you are reading contents from a file which itself is blocking in nature.
; So the send-off function will first immediately return the agent and continue with the file operation.
; When the file operation completes, it will automatically update the agent with the contents of the file.
(defn SendOff []
  "
  0
  0
  100
  "
  (def counter (agent 0))
  (println @counter)

  (send-off counter + 100)
  (println @counter)
  (println @counter))
(SendOff)


;Since there is a delay when a value of an agent is updated, Clojure provided a ‘await-for’ function which is used
; to specify time in milliseconds to wait for the agent to be updated.

(defn awaitfor []
  (def counter (agent 0))
  (println @counter)

  (send-off counter + 100)
  (println (await-for 3000 counter))
  (println @counter)

  (shutdown-agents))
(awaitfor)


;Blocks the current thread (indefinitely!) until all actions dispatched thus far, from this thread or agent,
; to the agent(s) have occurred. Will block on failed agents.

(defn await1 []
  (def counter (agent 0))
  (println @counter)

  (send-off counter + 100)
  (await counter)
  (println @counter)

  (shutdown-agents))
(await1)


;Returns the exception thrown during an asynchronous action of the agent, if the agent fails.
; Returns nil if the agent does not fail.
(defn agentError []
  (def my-date (agent(java.util.Date.)))
  (send my-date + 100)
  (await-for 100 my-date)
  (println (agent-error my-date)))
(agentError)
