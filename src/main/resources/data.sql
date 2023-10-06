INSERT INTO users (username, email, password) VALUES ('johndoe', 'johndoe@example.com', 'password123');
INSERT INTO users (username, email, password) VALUES ('janedoe', 'janedoe@example.com', 'password456');

INSERT INTO todo_items (user_id, title, due_date, priority, status) VALUES (1, 'Buy groceries', '2023-10-07', 'HIGH', 'DONE');
INSERT INTO todo_items (user_id, title, due_date, priority, status) VALUES (1, 'Finish work project', '2023-10-08', 'MEDIUM', 'IN_PROGRESS');
INSERT INTO todo_items (user_id, title, due_date, priority, status) VALUES (2, 'Call mom', '2023-10-06', 'LOW', 'DONE');
INSERT INTO todo_items (user_id, title, due_date, priority, status) VALUES (2, 'Go to gym', '2023-10-06', 'MEDIUM', 'IN_PROGRESS');