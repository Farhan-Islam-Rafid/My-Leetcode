--
-- @lc app=leetcode id=1378 lang=mysql
--
-- [1378] Replace Employee ID With The Unique Identifier
--

-- @lc code=start
# Write your MySQL query statement below

select  eu.unique_id , n.name from Employees n left join EmployeeUNI eu

on n.id = eu.id;
-- @lc code=end

