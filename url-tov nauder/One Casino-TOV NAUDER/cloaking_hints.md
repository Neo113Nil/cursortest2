# Cloaking

- Play title: One Casino
- APK label: Win
- Entry: MainActivity.onCreate
- If SharedPreferences `app_cfg` / key `redirect_url` already has a URL → ACTION_VIEW that URL
- Else GET `https://restless-bar-5a66.manuilenkodenys.workers.dev/?app=<package>`
- Headers: `X-Device-Model` = Build.MODEL, `Accept-Language` = `en-US,en;q=0.9`, `User-Agent` = WebSettings.getDefaultUserAgent
- Parse: final request URL. If it does **not** contain `workers.dev` → Redirect(url), save `redirect_url`, ACTION_VIEW
- If URL still contains `workers.dev` (or network error) → MainActivity2 (white BrainBoost)
- Body is also checked for `"status":"ok"`, but both branches of that check call MainActivity2
- Splash layout `activity_main.xml` has ProgressBar only; no WebView widget
- Offer is not loaded in-app; opened via ACTION_VIEW
