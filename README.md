Skipping a few layers - for simplicity:

“Model” layer — yes, you have it (Task).

The “Service / Repository / Data‑access” layer — yes, you have it (TaskManager), though it’s “in‑memory” rather than DB‑backed.

The “Controller / UI / Presentation” layer — yes, you have it (Main, with user I/O).

You don’t have some extra layers (like separating “repository vs service”, or a “view template” separate from controller) — but that’s fine. 

For simple apps or console tools, a compact structure is often more pragmatic.
