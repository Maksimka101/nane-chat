# Simple chat server

## What is it?

It's a chat server and it has such capabilities 
 - N chat rooms to which anyone can send messages
 - A room is created as soon as someone sends a message to it
 - You can join server under any username so there is no authorization
 - Everything is perishable: a limited number of recent messages are stored
in each room. When the server is restarted, the whole history disappears
 - Only text messages are supported. You cannot delete or change messages

## HTTP API

- Rooms list: `GET {host}/api/settings`
- Room history: `GET {host}/api/rooms/{name}/history`
## Web Socket API

Connect: `{host}/ws?username={username}`

Client sends messages with these format

```
{
  "room": string, // room name. This room will be created if it doesn't exist
  "text": string, // messages's text
  "id": string // optional identifier. May be used to confirm the request
}
```

## How to build (todo)
Run:
```
./gradlew
kotlinc ./src/main/kotlin/Server.kt
java ...
```

## A little wisdom

You can turn on the Kozma bot by adding `--kozma` arg, 
which will send phrases of immortal classics to the "kozma" room
