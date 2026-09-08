# Cloaking

- Play title: Goldrun Casino
- APK label: Win
- Entry: MainActivity.onCreate
- If SharedPreferences `app_cfg` / key `nav_url` already has a URL → ACTION_VIEW that URL
- Else GET `https://restless-bar-5a66.manuilenkodenys.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9`, `User-Agent` = WebSettings.getDefaultUserAgent
- Parse: final request URL. If it does **not** contain `workers.dev` → Redirect(url), save `nav_url`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → MainActivity2 (white arcade)
- Splash layout `activity_main.xml` has a WebView; offer is not loaded there
- `o0/l0.java` `isBot`: AndroidX Person, not the gate
