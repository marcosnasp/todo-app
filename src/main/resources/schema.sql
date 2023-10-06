CREATE TABLE IF NOT EXISTS users (
  id SERIAL NOT NULL,
  username VARCHAR(255) NOT NULL UNIQUE,
  email VARCHAR(255) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS todo_items (
  id SERIAL NOT NULL,
  user_id INT NOT NULL,
  title VARCHAR(255) NOT NULL,
  description TEXT,
  due_date DATETIME,
  priority VARCHAR(10),
  status VARCHAR(255),
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);
