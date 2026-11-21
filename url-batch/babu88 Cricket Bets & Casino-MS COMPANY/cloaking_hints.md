# Cloaking hints

- Play / карточка: `babu88 Cricket Bets & Casino`. application-label в APK: `Win`.
- LAUNCHER: `com.force.gold.code.nexus.bolt.babu88cricketbetscasino.MainActivity` (заставка + ProgressBar).
- Белая оболочка: `MainActivity2` (GlobalApp16 / RunFast: Runner, Flappy, Stack, Helix).
- Gate GET `https://pk17northernmeadowworks.online/?t=5d3f101c` после случайной задержки ~671–2922 мс.
- Заголовки: `User-Agent` (WebSettings.getDefaultUserAgent), `Accept-Language` = `en-US,en;q=0.9`, `X-Device-Model` (Build.MODEL).
- OkHttp `followRedirects=false` / `followSslRedirects=false`. 3xx + Location → `open_url` + ACTION_VIEW. Иначе / ошибка сети → MainActivity2.
- SharedPreferences `local` / ключ `open_url`. Белая оболочка: `runfast_prefs`.
- PairIP `LicenseClient.checkLicense` в `Application.attachBaseContext`.
