DROP table employee ;
DROP table department;

CREATE TABLE department
(
   DEPT_ID int PRIMARY KEY,
   DEPT_NAME varchar(20)
);


CREATE  TABLE employee
(
  EMP_ID int,
  EMP_NAME varchar(20),
  EMP_SALARY decimal(10,2),
  DEPT_ID int,
  PRIMARY KEY (EMP_ID),
  FOREIGN KEY (DEPT_ID) REFERENCES department(DEPT_ID)
);

SELECT  * FROM employee ;
SELECT * FROM department;


INSERT INTO department VALUES(1,'A');
INSERT INTO department VALUES(2,'B');
INSERT INTO department VALUES(3,'C');
INSERT INTO department VALUES(4,'D');
INSERT INTO department VALUES(5,'E');
INSERT INTO department VALUES(6,'F');
INSERT INTO department VALUES(7,'G');
INSERT INTO department VALUES(8,'H');
INSERT INTO department VALUES(9,'I');
INSERT INTO department VALUES(10,'J');
INSERT INTO department VALUES(11,'K');
INSERT INTO department VALUES(12,'L');
INSERT INTO department VALUES(13,'M');
INSERT INTO department VALUES(14,'N');
INSERT INTO department VALUES(15,'O');
INSERT INTO department VALUES(16,'P');
INSERT INTO department VALUES(17,'Q');
INSERT INTO department VALUES(18,'R');
INSERT INTO department VALUES(19,'S');
INSERT INTO department VALUES(20,'T');
INSERT INTO department VALUES(21,'U');
INSERT INTO department VALUES(22,'V');
INSERT INTO department VALUES(23,'W');
INSERT INTO department VALUES(24,'X');
INSERT INTO department VALUES(25,'Y');
INSERT INTO department VALUES(26,'Z');


INSERT INTO employee VALUES(1,'a',1500.22,5);
INSERT INTO employee VALUES(2,'b',700.55,5);
INSERT INTO employee VALUES(3,'c',700.55,5);
INSERT INTO employee VALUES(4,'d',10.01,8);
INSERT INTO employee VALUES(5,'e',10.01,8);
INSERT INTO employee VALUES(6,'f',4000.01,9);
INSERT INTO employee VALUES(7,'g',10.01,10);
INSERT INTO employee VALUES(8,'h',10.01,7);
INSERT INTO employee VALUES(9,'i',10.01,25);
INSERT INTO employee VALUES(10,'j',10.01,13);
INSERT INTO employee VALUES(11,'k',10.01,14);
INSERT INTO employee VALUES(12,'l',10.01,14);
INSERT INTO employee VALUES(13,'m',700.55,17);
INSERT INTO employee VALUES(14,'n',10.01,17);
INSERT INTO employee VALUES(15,'o',40000.00,17);
INSERT INTO employee VALUES(16,'p',10.01,9);
INSERT INTO employee VALUES(17,'q',10.01,9);
INSERT INTO employee VALUES(18,'r',10.01,11);
INSERT INTO employee VALUES(19,'s',30000.00,11);
INSERT INTO employee VALUES(20,'t',10.01,17);
INSERT INTO employee VALUES(21,'u',10.01,18);
INSERT INTO employee VALUES(22,'v',20000.00,18);
INSERT INTO employee VALUES(23,'w',50000.01,12);
INSERT INTO employee VALUES(24,'x',10.01,12);
INSERT INTO employee VALUES(25,'y',10.01,12);
INSERT INTO employee VALUES(26,'z',40000.00,15);


-- count of dept_id in descending order

SELECT dept_id, count(dept_id) FROM employee GROUP BY dept_id ORDER BY count(dept_id) desc;

-- salary in descending order

SELECT DISTINCT emp_salary FROM employee ORDER BY emp_salary desc;

-- max salary --

SELECT e.emp_id , MAX(e.emp_salary) FROM employee e;

SELECT e1.emp_name, e1.emp_salary FROM employee e1 WHERE 1-1= (SELECT count(DISTINCT e2.emp_salary) FROM employee e2 WHERE e2.emp_salary> e1.emp_salary);

SELECT * FROM (SELECT emp_name,emp_salary,DENSE_RANK() OVER (ORDER BY emp_salary DESC) AS emp_salary_rank FROM employee) AS TEMP WHERE emp_salary_rank=5;


SELECT e.emp_id , e.emp_salary FROM employee e WHERE e.emp_salary IN (
SELECT emp_salary FROM employee ORDER BY emp_salary DESC LIMIT 2 OFFSET 1
);

SELECT e.emp_id , e.emp_salary FROM employee e WHERE e.emp_salary IN (
SELECT emp_salary FROM employee ORDER BY emp_salary DESC LIMIT 1,1
);

--------------

SELECT d.dept_name,e.dept_id,e.emp_name,e.emp_salary FROM employee e INNER JOIN department d ON e.dept_id=d.dept_id WHERE (e.dept_id,e.emp_salary) IN
(SELECT e.dept_id , MAX(e.emp_salary) FROM employee e GROUP BY e.dept_id);

SELECT e.dept_id ,e.emp_name, e.emp_salary FROM employee e WHERE (e.dept_id,e.emp_salary) IN
(SELECT e.dept_id , MAX(e.emp_salary) FROM employee e GROUP BY e.dept_id) ORDER BY emp_salary DESC;



