# Test Table for TeamBTest

| Test Case ID | Test Method                    | Input           | Expected Output         | Actual Output           | Status |
|--------------|--------------------------------|-----------------|-------------------------|-------------------------|--------|
| TC01         | `testGetRankFromGrade_A`       | Grade: "A"      | "High Distinction"      | "High Distinction"      | Pass   |
| TC02         | `testGetRankFromGrade_BPlus`   | Grade: "B+"     | "Distinction"           | "Distinction"           | Pass   |
| TC03         | `testGetRankFromGrade_C`       | Grade: "C"      | "Failed"                | "Failed"                | Pass   |
| TC05         | `testGetRankFromGrade_Unknown` | Grade: "Z"      | "Unknown"               | "Unknown"               | Pass   |
| TC06         | `testCalculateBuddhistEra`     | Age: 20         | 2547                    | 2547                    | Pass   |
