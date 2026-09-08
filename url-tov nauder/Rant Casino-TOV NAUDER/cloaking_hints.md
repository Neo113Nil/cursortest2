# Cloaking

- Play title: Rant Casino
- APK label: Win
- Entry: MainActivity.onCreate
- If SharedPreferences `data` / key `dest` already has a URL → ACTION_VIEW that URL
- Else GET `https://restless-bar-5a66.manuilenkodenys.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9`, `User-Agent` = WebSettings.getDefaultUserAgent
- Parse: final request URL. If it does **not** contain `workers.dev` → save `dest`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → MainActivity2 (white arcade)
- Body is also checked for `"status":"ok"`, but both branches of that check call the white path
- Splash `activity_main.xml` has a WebView widget; offer is opened via ACTION_VIEW, not loadUrl
- `o0/l0.java` `isBot`: AndroidX Person, not the gate
