format 222

classinstance 128002 class_ref 128123 // Player
  name ""   xyz 36 5 2000 life_line_z 2000
classinstance 128130 class_ref 128251 // Game
  name ""   xyz 134 6 2000 life_line_z 2000
classinstance 128258 class_ref 128379 // FileIO
  name ""   xyz 446 5 2000 life_line_z 2000
classinstance 128386 class_ref 128507 // WorldList
  name ""   xyz 220 10 2000 life_line_z 2000
classinstance 128514 class_ref 128635 // SecretWord
  name ""   xyz 328 4 2000 life_line_z 2000
durationcanvas 128642 classinstance_ref 128002 // :Player
  xyzwh 53 69 2010 11 40
end
durationcanvas 128770 classinstance_ref 128130 // :Game
  xyzwh 154 69 2010 11 57
end
durationcanvas 129410 classinstance_ref 128386 // :WorldList
  xyzwh 246 81 2010 11 283
  overlappingdurationcanvas 130178
    xyzwh 252 129 2020 11 75
  end
  overlappingdurationcanvas 130946
    xyzwh 252 209 2020 11 149
  end
end
durationcanvas 129922 classinstance_ref 128258 // :FileIO
  xyzwh 465 91 2010 11 65
end
durationcanvas 130434 classinstance_ref 128514 // :SecretWord
  xyzwh 365 180 2010 11 53
end
durationcanvas 131202 classinstance_ref 128130 // :Game
  xyzwh 154 347 2010 11 25
end
durationcanvas 131458 classinstance_ref 128002 // :Player
  xyzwh 53 172 2010 11 56
  overlappingdurationcanvas 131842
    xyzwh 59 197 2020 11 25
  end
end
durationcanvas 131586 classinstance_ref 128130 // :Game
  xyzwh 154 172 2010 11 108
end
durationcanvas 132098 classinstance_ref 128002 // :Player
  xyzwh 53 415 2010 11 50
  overlappingdurationcanvas 132482
    xyzwh 59 434 2020 11 25
  end
end
durationcanvas 132226 classinstance_ref 128130 // :Game
  xyzwh 154 415 2010 11 25
end
msg 128898 synchronous
  from durationcanvas_ref 128642
  to durationcanvas_ref 128770
  yz 69 2015 explicitmsg "newGame"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 76 56
msg 129538 synchronous
  from durationcanvas_ref 128770
  to durationcanvas_ref 129410
  yz 81 2015 explicitmsg "get Wordlist"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 174 68
msg 130050 synchronous
  from durationcanvas_ref 129410
  to durationcanvas_ref 129922
  yz 91 2020 explicitmsg "read wordlist file"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 351 76
msg 130306 synchronous
  from durationcanvas_ref 129922
  to durationcanvas_ref 130178
  yz 129 2025 explicitmsg "words"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 360 116
msg 130562 synchronous
  from durationcanvas_ref 130178
  to durationcanvas_ref 130434
  yz 180 2025 explicitmsg "get Secret Word"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 270 164
msg 131074 synchronous
  from durationcanvas_ref 130434
  to durationcanvas_ref 130946
  yz 209 2025 explicitmsg "secretWord"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 279 196
msg 131330 synchronous
  from durationcanvas_ref 130946
  to durationcanvas_ref 131202
  yz 347 2025 explicitmsg "secret word"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 176 334
msg 131714 synchronous
  from durationcanvas_ref 131458
  to durationcanvas_ref 131586
  yz 172 2015 explicitmsg "try letter"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 79 159
msg 131970 synchronous
  from durationcanvas_ref 131586
  to durationcanvas_ref 131842
  yz 197 2025 explicitmsg "show response"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 67 184
msg 132354 synchronous
  from durationcanvas_ref 132098
  to durationcanvas_ref 132226
  yz 415 2015 explicitmsg "end Game"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 80 402
msg 132610 synchronous
  from durationcanvas_ref 132226
  to durationcanvas_ref 132482
  yz 434 2025 explicitmsg "player Score"
  show_full_operations_definition default show_class_of_operation default drawing_language default show_context_mode default
  label_xy 78 421
end
