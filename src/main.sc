require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Let's start.

    state: Hello
        intent!: /hello
        a: How may I assist you today?

    state: Bye
        intent!: /bye
        a: Bye bye

    state: NoMatch
        event!: noMatch
        a: I do not understand. You said: {{$request.query}}
