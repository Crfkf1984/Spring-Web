create table springmvc.todos(
                                id int not null auto_increment,
                                title varchar(55),
                                description varchar(255),
                                priority varchar(10),
                                data timestamp,
                                primary key (id));

insert into todos(title, description, priority, data)
values('Market', 'Go to market bay milk', 'Higth', '2022-01-01'),
      ('Car','Go bay self car', 'Middle', '2022-01-02'),
      ('Kino', 'Go to in kino', 'Low', '2022-01-03'),
      ('Cat', 'Have wasch cats', 'Higth', '2022-1-04'),
      ('Job', 'Go to in my job', 'Low', '2022-10-11');