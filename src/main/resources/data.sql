INSERT INTO public.job_post
(post_id, post_desc, post_profile, post_tech_stack, req_experience)
VALUES
(1, 'Develop and maintain backend services', 'Backend Developer', ARRAY['Java', 'Spring Boot', 'PostgreSQL'], 3),

(2, 'Build responsive UI components', 'Frontend Developer', ARRAY['React', 'JavaScript', 'HTML', 'CSS'], 2),

(3, 'Design and optimize database systems', 'Database Engineer', ARRAY['PostgreSQL', 'PL/pgSQL', 'SQL'], 4),

(4, 'Maintain cloud infrastructure and CI/CD pipelines', 'DevOps Engineer', ARRAY['AWS', 'Docker', 'Kubernetes', 'Jenkins'], 5),

(5, 'Develop scalable mobile applications', 'Mobile App Developer', ARRAY['Flutter', 'Dart', 'Firebase'], 2);