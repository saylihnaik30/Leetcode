SELECT today.id
FROM Weather AS today
JOIN Weather AS previous
ON today.recordDate = DATE_ADD(previous.recordDate, INTERVAL 1 DAY)
WHERE today.temperature > previous.temperature;
