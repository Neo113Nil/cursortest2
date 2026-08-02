# Icons – prompts for AI image generator

Use these prompts to generate **game icons**. Save each as PNG with transparent background, square format (e.g. 256×256 or 512×512). Place files in this folder.

---

## 1. Player / spaceship icon

**English prompt:**

```
Minimalist spaceship or rocket icon, top-down or isometric view, single solid color soft cyan or silver on transparent background, clean geometric shape, futuristic but simple, no details, no glow, no gradient, flat design, suitable for mobile game character marker, square crop.
```

**Alternative (more “player” than ship):**

```
Simple astronaut or capsule icon, top-down view, one color soft cyan on transparent background, minimal lines, futuristic, no face details, no glow, flat icon style, game UI asset.
```

---

## 2. Exit portal icon

**English prompt:**

```
Minimalist portal or gateway icon, circular or ring shape, soft cyan or silver color on transparent background, clean geometric design, sci-fi exit symbol, no glow, no animation suggestion, flat icon, single color, mobile game exit marker, square crop.
```

**Alternative:**

```
Stargate or wormhole icon, simple ring with center void, one color cyan or silver, transparent background, minimal, futuristic, no particles, no glow, flat design, game asset.
```

---

## 3. Optional: wall / obstacle tile (if you want custom wall texture)

**English prompt:**

```
Single tile texture, dark blue or navy hexagon or square, metallic or matte, subtle edge highlight, no pattern, seamless, transparent or dark background, minimalist, game maze wall asset, 256x256.
```

---

## File names to use in the app

- **Background:** `space_bg.png` → `assets/images/backgrounds/space_bg.png`
- **Player icon:** `player.png` → `assets/images/icons/player.png`
- **Exit icon:** `exit_portal.png` → `assets/images/icons/exit_portal.png`

After adding the PNG files, the app code can be updated to use `AssetImage('assets/images/backgrounds/space_bg.png')` and similar paths for the icons.
