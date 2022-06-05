movies = {
    StarWars: 4.8, 
    Divergent: 4.7
    }
  
  puts "What would you like to do? "
  puts "..type add to add movies"
  puts "..type update to update reviews"
  puts "..display to display the movie list"
  puts "..delete to delete the movie"
  
  choice = gets.chomp
  
  case choice

  when "add"
    puts "What movie would you like to add? "
    title = gets.chomp
    if movies[title.to_sym].nil? # check the given title is already present are not
      puts "What rating does the movie have? "
      rating = gets.chomp
      movies[title.to_sym] = rating.to_i  #updates the rating of the newly added movie
    else
      puts "That movie already exists! Its rating is #{movies[title.to_sym]}."
    end

  when "update"
    puts "What movie would you like to update? "
    title = gets.chomp
    if movies[title.to_sym].nil? 
      puts "That movie does not exist."
    else
      puts "What is the new rating? "
      rating = gets.chomp
      movies[title.to_sym] = rating.to_i #updates the rating of existig movie
    end

  when "display"
     movies.each {|movie, rating| puts "#{movie}: #{rating}"} #displays the movie list

  when "delete"
    puts "What movie would you like to delete? "
    title = gets.chomp
    if movies[title.to_sym].nil? 
      puts "That movie does not exist."
    else
      movies.delete(:title)  #deletes the movie given in title
    end
  else
    puts "Error!"
  end