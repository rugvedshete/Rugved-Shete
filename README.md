# 🏦 Market Making Strategy Simulator – NSE (HFT Style)

This project simulates a **Market Making strategy** — a fundamental component of **High-Frequency Trading** — on **HDFC Bank (NSE)** 5-minute data.  
The strategy continuously quotes both **Bid** and **Ask** prices around the mid-price, profits from **spread capture**, and dynamically manages **inventory risk**.

---

## 📌 Objective

✔ Understand how market makers provide liquidity  
✔ Simulate order fills and market microstructure dynamics  
✔ Track P&L, trade flow, and inventory exposure  
✔ Evaluate risk-adjusted spread profitability

---

## 🔍 Strategy Logic

- Calculate Mid-Price → `(High + Low) / 2`
- Place two quotes:
  - **Bid below mid** → Buy if hit
  - **Ask above mid** → Sell if hit
- Randomized order-flow simulates real market conditions
- Mark-to-market P&L recorded at each time step

📈 Profit comes from **collecting the bid-ask spread**  
⚠ Risk comes from **inventory accumulation**

---

## 📊 Results & Visuals

| Metric | Value |
|-------|------|
| Final P&L | ₹XX,XXX |
| Max Inventory | X lots |
| Hit Rate | XX % |

📌 *Replace XX after your own execution results*  
Add screenshots here:

- Equity Curve 📈  
- Inventory Exposure 📉  

---

## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| **Python (Jupyter)** | Strategy Development |
| **yfinance** | NSE Market Data |
| **NumPy / Pandas** | Simulated Order Execution |
| **matplotlib** | P&L / Inventory Visualization |

---


---

## 🚀 Future Enhancements

🔹 Real NSE LOB (Level 2) if available  
🔹 VWAP/TWAP execution constraints  
🔹 Risk constraints on quote width  
🔹 Microprice & order-book imbalance model

---
