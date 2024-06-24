import io from "socket.io-client";

const URL = `ws://localhost:${process.env.REACT_APP_WEBSOCKET_PORT}`;
export const socket = io(URL, {
  autoConnect: false,
  transports: ["websocket"],
});
